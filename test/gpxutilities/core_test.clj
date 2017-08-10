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

  (facts "about angular distance"
    (fact "some obvious facts"
      (gpxutilities.core/angular-distance-between 90 0) => (/ java.lang.Math/PI 2)
      (gpxutilities.core/angular-distance-between -45 45) => (/ java.lang.Math/PI 2)
      (gpxutilities.core/angular-distance-between 2 1) => (/ java.lang.Math/PI 180)
      (gpxutilities.core/angular-distance-between 5 5) => 0.0
    )
  )

  (facts "about surface distance"
    (fact "one radian is about mean-earth-radius"
      (gpxutilities.core/surface-distance 1) => gpxutilities.core/earth-mean-radius
    )
  )
