(ns com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ManagedInstanceLastAttempt$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`

  returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder [^ManagedInstanceLastAttempt$Builder this ^com.google.cloud.compute.v1.ManagedInstanceLastAttempt other]
    (-> this (.mergeFrom other))))

(defn get-errors
  "[Output Only] Encountered errors during the last attempt to create or delete the instance.

  returns: `com.google.cloud.compute.v1.Errors`"
  (^com.google.cloud.compute.v1.Errors [^ManagedInstanceLastAttempt$Builder this]
    (-> this (.getErrors))))

(defn set-errors
  "[Output Only] Encountered errors during the last attempt to create or delete the instance.

  errors - `com.google.cloud.compute.v1.Errors`

  returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder [^ManagedInstanceLastAttempt$Builder this ^com.google.cloud.compute.v1.Errors errors]
    (-> this (.setErrors errors))))

(defn build
  "returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt [^ManagedInstanceLastAttempt$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder`"
  (^com.google.cloud.compute.v1.ManagedInstanceLastAttempt$Builder [^ManagedInstanceLastAttempt$Builder this]
    (-> this (.clone))))

