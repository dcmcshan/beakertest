(ns beakertest.core
 (:require [clj-time.coerce :refer :all]))

(defn foo
  "I don't do a whole lot."
  [x]
  
  (println x "Hello, World!")
  (let [dt (from-long 893462400000)
        d  (to-date dt)]
    (= dt (from-date d))))



