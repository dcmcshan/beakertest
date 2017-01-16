(ns beakertest.core
 (:require [clj-time.coerce :refer [from-date]])
)

(defn foo
  "I don't do a whole lot."
  [x]
  (= org.joda.time.DateTime (type x)) (encode [(str x) "xsd:dateTime"])
  (println x "Hello, World!"))



