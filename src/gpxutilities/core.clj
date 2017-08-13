(ns gpxutilities.core
  (:gen-class))

(def earth-mean-radius 6371000)

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

(defn surface-distance [angle]
  "calculates the surface distance between two points from the angular distance"
  (* angle earth-mean-radius)
)

(defn pythagorean-approximation [surface-distance1 surface-distance2]
  (Math/sqrt (+ (* surface-distance1 surface-distance1) (* surface-distance2 surface-distance2)))
)

(defn haversine [theta]
  (/ (- 1 (Math/cos theta)) 2))
