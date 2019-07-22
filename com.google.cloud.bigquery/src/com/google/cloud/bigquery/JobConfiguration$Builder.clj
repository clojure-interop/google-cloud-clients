(ns com.google.cloud.bigquery.JobConfiguration$Builder
  "Base builder for job configurations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery JobConfiguration$Builder]))

(defn build
  "Creates an object.

  returns: `T`"
  ([^JobConfiguration$Builder this]
    (-> this (.build))))

