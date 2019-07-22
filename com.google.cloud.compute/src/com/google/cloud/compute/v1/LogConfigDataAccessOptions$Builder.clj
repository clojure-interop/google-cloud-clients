(ns com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 LogConfigDataAccessOptions$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.LogConfigDataAccessOptions`

  returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder [^LogConfigDataAccessOptions$Builder this ^com.google.cloud.compute.v1.LogConfigDataAccessOptions other]
    (-> this (.mergeFrom other))))

(defn get-log-mode
  "Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant
   only in the LocalIAM implementation, for now.

  returns: `java.lang.String`"
  (^java.lang.String [^LogConfigDataAccessOptions$Builder this]
    (-> this (.getLogMode))))

(defn set-log-mode
  "Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant
   only in the LocalIAM implementation, for now.

  log-mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder [^LogConfigDataAccessOptions$Builder this ^java.lang.String log-mode]
    (-> this (.setLogMode log-mode))))

(defn build
  "returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions [^LogConfigDataAccessOptions$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder`"
  (^com.google.cloud.compute.v1.LogConfigDataAccessOptions$Builder [^LogConfigDataAccessOptions$Builder this]
    (-> this (.clone))))

