![Build develop](https://github.com/github/docs/actions/workflows/main.yml/badge.svg?branch=develop)
![Build main](https://github.com/github/docs/actions/workflows/main.yml/badge.svg?branch=main)
# BinaryCodeConverter
Convter Binary code &lt;-> Gray Code


## Abstract
Converter binary digit to gray and gray code to binary, also you can see decimal representation

## Options
 - --help (Show how to use instruction)
 - -bg (BinaryToGray - Convert binary digit to gray code)
 - -gb (GrayToBinary - Convert gray code binary digit to binary)
 Aftet -bg or -gb you need to input binary digit
 
 Example:
 ```sh
app.jar -bg 1010
```


## How to use (Without docker)
Clone repository:
```sh
git clone https://github.com/yantimirov-timur/BinaryCodeConverter.git
```
Go to working directory
```sh
cd converter
```
Build application
```sh
./gradlew build
```
Run application with options (See point "Options")
```sh
java -jar build/libs/converter-1.0.jar (options)
```
## How to use (With Docker)
Clone repository:
```sh
git clone https://github.com/yantimirov-timur/BinaryCodeConverter.git
```
Go to working directory
```sh
cd converter
```
Build image
```sh
docker build -t converter .
```
Run application with options (See point "Options")
```sh
docker run converter (options)
```
