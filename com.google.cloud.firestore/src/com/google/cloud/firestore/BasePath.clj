(ns com.google.cloud.firestore.BasePath
  "BasePath represents a path sequence in the Firestore database. It is composed of an ordered
  sequence of string segments."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore BasePath]))

(defn ->base-path
  "Constructor."
  (^BasePath []
    (new BasePath )))

(defn compare-to
  "Compare the current path lexicographically against another Path object.

  other - The path to compare to. - `B`

  returns: -1 if current is less than other, 1 if current greater than other, 0 if equal - `int`"
  (^Integer [^BasePath this other]
    (-> this (.compareTo other))))

