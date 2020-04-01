mvn clean
mvn package

# 拷贝文件到目标目录
rm -rdf ./target/release
mkdir ./target/release
cp ./target/screenbroadcast*.jar ./target/release/ScreenbBroadcast.jar
cp -R ./web ./target/release/

# mac app打包: http://centerkey.com/mac/java/
jdk=$(/usr/libexec/java_home)
$jdk/bin/javapackager \
   -deploy \
   -native image \
   -name PhotoExplorer \
   -BappVersion=0.0.0 \
   -Bicon=app.icns \
   -srcdir ./target/release \
   -srcfiles ScreenbBroadcast.jar:web/index.html:web/mouse.png \
   -appclass com.zwc.photoexplorer.PhotoExplorer
   -outdir target/release/result \
   -outfile PhotoExplorer \
   -nosign \
   -v

cd ./target/release/result/bundles
zip -r9 PhotoExplorer.zip ./*