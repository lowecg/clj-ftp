(defproject com.velisco/clj-ftp "1.2.0"
  :description "Clojure wrapper on Apache Commons Net for FTP"
  :url "http://github.com/miner/clj-ftp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0"
  :deploy-repositories [["releases" :clojars]
                        ["clojars" {:url "https://repo.clojars.org"
                                   :sign-releases false}]]
  :dependencies [[org.clojure/clojure "1.12.3"]
                 [clj-commons/fs "1.6.312"]
                 [commons-net "3.12.0"]]
  :profiles {:test {:resource-paths ["test-resources"]
                    :dependencies [[org.mockftpserver/MockFtpServer "3.2.0"]
                                   [org.slf4j/slf4j-jdk14 "2.0.17"]
                                   [digest "1.4.10"]]}})

