(ns gpxutilities.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "This will become my gpx utilities project"))

(defn distance-between [from to]
  )

(defn lat-distance-between [from to]
  (Math/abs (- from to))
  )

(defn lon-distance-between [from to]
  )
