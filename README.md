# maven
実行にあたり重要なコマンドは以下
# ローカル環境動作

```zsh:zsh
docker-compose up -d --build
docker-compose ps
```

# クリーン・ビルド・テスト・パッケージ・デプロイ

```zsh:zsh
mvn clean package tomcat7:deploy
```
