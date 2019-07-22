(ns com.google.cloud.compute.v1.Warning$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Warning$Builder]))

(defn get-code
  "[Output Only] A warning code, if applicable. For example, Compute Engine returns
   NO_RESULTS_ON_PAGE if there are no results in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^Warning$Builder this]
    (-> this (.getCode))))

(defn get-data-list
  "[Output Only] Metadata about this warning in key: value format. For example: \"data\": [ {
   \"key\": \"scope\", \"value\": \"zones/us-east1-d\" }

  returns: `java.util.List<com.google.cloud.compute.v1.Data>`"
  (^java.util.List [^Warning$Builder this]
    (-> this (.getDataList))))

(defn add-all-data
  "[Output Only] Metadata about this warning in key: value format. For example: \"data\": [ {
   \"key\": \"scope\", \"value\": \"zones/us-east1-d\" }

  data - `java.util.List`

  returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this ^java.util.List data]
    (-> this (.addAllData data))))

(defn build
  "returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^Warning$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this ^com.google.cloud.compute.v1.Warning other]
    (-> this (.mergeFrom other))))

(defn set-code
  "[Output Only] A warning code, if applicable. For example, Compute Engine returns
   NO_RESULTS_ON_PAGE if there are no results in the response.

  code - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this ^java.lang.String code]
    (-> this (.setCode code))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this]
    (-> this (.clone))))

(defn get-message
  "[Output Only] A human-readable description of the warning code.

  returns: `java.lang.String`"
  (^java.lang.String [^Warning$Builder this]
    (-> this (.getMessage))))

(defn add-data
  "[Output Only] Metadata about this warning in key: value format. For example: \"data\": [ {
   \"key\": \"scope\", \"value\": \"zones/us-east1-d\" }

  data - `com.google.cloud.compute.v1.Data`

  returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this ^com.google.cloud.compute.v1.Data data]
    (-> this (.addData data))))

(defn set-message
  "[Output Only] A human-readable description of the warning code.

  message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Warning$Builder`"
  (^com.google.cloud.compute.v1.Warning$Builder [^Warning$Builder this ^java.lang.String message]
    (-> this (.setMessage message))))

