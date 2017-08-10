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

(defn angular-distance-between [ang1 ang2]
  "calculates the angular distance between two points expressed in degrees in radians"
  (Math/abs (Math/toRadians (- ang1 ang2)))
)
