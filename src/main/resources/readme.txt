官方文件：
先看 Eclipse 或 IntelliJ 怎麼裝，gradle 和 maven 都有
https://openjfx.io/openjfx-docs/


副檔名 fxml 的 左下有 Text 和 Scene Builder，Scene Builder 打不開有以下幾種方式可解決
※如果出現 Download Scene Builder Kit，直接下載即可解決

※Java 版本要正確
File -> Project Structure --> Project 和 Modules
Help -> Find Action：搜尋「Switch Boot JDK」，然後會提示重啟 IDE，但新版本可能沒有

※升級 IDE

※都不行還可以安裝 Oracle 的軟體，但沒有嵌在 IDE 裡
雖然可在 Settings 搜尋 javaFX，路徑選擇安裝的路徑。
之後，在 fxml 按右鍵 Open in SceneBuilder 即可打開，但實際上還是沒有嵌在 IDE 裡
https://www.oracle.com/java/technologies/javafxscenebuilder-1x-archive-downloads.html

