const path = require("path");
const HTMLWebpackPlugin = require("html-webpack-plugin");

module.exports = {
  resolve: {
    modules: [
      path.resolve(__dirname, 'src'),
      'node_modules'
    ]
  },
  entry: "index.js",
  output: {
    filename: "bundle.js",
    path: path.resolve("build"),
    publicPath: "/",
  },
  module: {
    rules:[
      {
        test: /\.(js|jsx)$/,
        exclude: /node_modules/,
        use: "babel-loader"
      },
      {
        test: /\.html$/,
        use: "html-loader"
      },
      {
        test: /\.css$/,
        use: ["style-loader", "css-loader"]
      }
    ]
  },
  plugins: [
    new HTMLWebpackPlugin({
      template: "src/index.html"
    }),
  ],
  devtool: 'source-map'
}