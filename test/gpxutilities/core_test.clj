(ns gpxutilities.core-test
  (:require [midje.sweet :refer :all]
            [gpxutilities.core :refer :all]))

(facts "about lat-distance-between"
  (fact "is absolute value of from minus to"
    (gpxutilities.core/lat-distance-between 1 2) => 1
    (gpxutilities.core/lat-distance-between 3 2) => 1
  ))

  (facts "about degrees and raidans"
    (fact "basic conversions"
    (java.lang.Math/toRadians 0) => 0.0
    (java.lang.Math/toRadians 90) => (/ java.lang.Math/PI 2)
    (java.lang.Math/toRadians 180) => java.lang.Math/PI))
