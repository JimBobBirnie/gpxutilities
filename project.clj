(defproject gpxutilities "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                  [midje "1.8.3"]]
  :main ^:skip-aot gpxutilities.core
  :target-path "target/%s"
  :profiles {
    :dev {:dependencies [[midje "1.8"]]
          :plugins [[lein-midje "3.2.1"]]}
    :uberjar {:aot :all}})
