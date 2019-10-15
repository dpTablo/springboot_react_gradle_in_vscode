const path = require("path");
const webpack = require("webpack")

module.exports = {
    mode: 'development',    
    devtool: 'inline-source-map',
    context: path.resolve(__dirname, 'src/main/jsx'),
    entry: {
        index: "./page/Index.jsx",
        page2: "./page/page2.jsx"
    },    
    output: {
        path: __dirname,
        filename: './srg/js/react/[name].bundle.js'
    }, 
    module: {
        rules: [ 
            {
                test: /\.jsx?$/,
                exclude: /(node_modules)/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: [ '@babel/preset-env', '@babel/preset-react' ]
                    }
                }
            },
            {
                test: /\.css$/,
                use: [ 'style-loader', 'css-loader' ]
            },
            {
				test: /\.scss$/,
				use: [ 'style-loader', 'css-loader', 'sass-loader' ]
            }           
        ]
    },
    devServer: {
        historyApiFallback: true,
        inline: true,
        hot: true,
        compress: true,
        publicPath: '/',
        host: "localhost",
        port: 3000,
        proxy: {
            "**": "http://localhost:8080/srg"
        }
    },
    plugins: [
        new webpack.NamedModulesPlugin(),
        new webpack.HotModuleReplacementPlugin()
    ]
}