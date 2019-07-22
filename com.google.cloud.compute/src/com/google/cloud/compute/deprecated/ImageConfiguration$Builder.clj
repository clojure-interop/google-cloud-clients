(ns com.google.cloud.compute.deprecated.ImageConfiguration$Builder
  "Base builder for image configurations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ImageConfiguration$Builder]))

(defn build
  "Creates a configuration object.

  returns: `T`"
  ([^ImageConfiguration$Builder this]
    (-> this (.build))))

