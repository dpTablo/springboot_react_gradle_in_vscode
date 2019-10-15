const path = require("path");
const webpack = require("webpack")

module.exports = {
    mode: 'development',    
    devtool: 'inline-source-map',
    devServer: {
        historyApiFallback: true,
        inline: true,
        hot: true,
        compress: true,
        publicPath: '/js/react/',
        host: "localhost",
        port: 3000,
        proxy: {
            "**": "http://localhost:8080/srg"
        }
    },
    plugins: [
        new webpack.NamedModulesPlugin(), //브라우저에서 HMR 에러발생시 module name 표시
        new webpack.HotModuleReplacementPlugin()
    ]
}