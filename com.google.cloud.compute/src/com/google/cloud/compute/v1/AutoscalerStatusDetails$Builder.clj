(ns com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerStatusDetails$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.AutoscalerStatusDetails`

  returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^AutoscalerStatusDetails$Builder this ^com.google.cloud.compute.v1.AutoscalerStatusDetails other]
    (-> this (.mergeFrom other))))

(defn get-message
  "The status message.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerStatusDetails$Builder this]
    (-> this (.getMessage))))

(defn set-message
  "The status message.

  message - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^AutoscalerStatusDetails$Builder this ^java.lang.String message]
    (-> this (.setMessage message))))

(defn get-type
  "The type of error returned.

  returns: `java.lang.String`"
  (^java.lang.String [^AutoscalerStatusDetails$Builder this]
    (-> this (.getType))))

(defn set-type
  "The type of error returned.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^AutoscalerStatusDetails$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails [^AutoscalerStatusDetails$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder`"
  (^com.google.cloud.compute.v1.AutoscalerStatusDetails$Builder [^AutoscalerStatusDetails$Builder this]
    (-> this (.clone))))

