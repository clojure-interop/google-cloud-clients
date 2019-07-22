(ns com.google.cloud.container.v1.SampleApp
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.container.v1 SampleApp]))

(defn ->sample-app
  "Constructor."
  (^SampleApp []
    (new SampleApp )))

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (SampleApp/main args)))

(defn *execute-no-catch
  "throws: java.lang.Exception"
  ([]
    (SampleApp/executeNoCatch )))

