const path = require("path");

module.exports = {
    mode: 'production',
    context: path.resolve(__dirname, 'src/main/jsx'),
    entry: {
        index: "./page/Index.jsx",
        page2: "./page/page2.jsx"
    },    
    output: {
        path: __dirname,
        filename: './src/main/webapp/js/react/[name].bundle.js'
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
    }
}