(ns com.google.cloud.compute.v1.Error$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Error$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Error`

  returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^Error$Builder this ^com.google.cloud.compute.v1.Error other]
    (-> this (.mergeFrom other))))

(defn get-errors-list
  "[Output Only] The array of errors encountered while processing this operation.

  returns: `java.util.List<com.google.cloud.compute.v1.Errors>`"
  (^java.util.List [^Error$Builder this]
    (-> this (.getErrorsList))))

(defn add-all-errors
  "[Output Only] The array of errors encountered while processing this operation.

  errors - `java.util.List`

  returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^Error$Builder this ^java.util.List errors]
    (-> this (.addAllErrors errors))))

(defn add-errors
  "[Output Only] The array of errors encountered while processing this operation.

  errors - `com.google.cloud.compute.v1.Errors`

  returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^Error$Builder this ^com.google.cloud.compute.v1.Errors errors]
    (-> this (.addErrors errors))))

(defn build
  "returns: `com.google.cloud.compute.v1.Error`"
  (^com.google.cloud.compute.v1.Error [^Error$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Error$Builder`"
  (^com.google.cloud.compute.v1.Error$Builder [^Error$Builder this]
    (-> this (.clone))))

