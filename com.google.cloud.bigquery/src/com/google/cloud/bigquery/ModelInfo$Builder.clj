(ns com.google.cloud.bigquery.ModelInfo$Builder
  "A builder for ModelInfo objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ModelInfo$Builder]))

(defn ->builder
  "Constructor."
  (^ModelInfo$Builder []
    (new ModelInfo$Builder )))

(defn set-description
  "Sets the user description for this model.

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-friendly-name
  "Sets the user-friendly name for this model.

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-expiration-time
  "Set the time when this model expires, in milliseconds since the epoch. If not present, the
   model persists indefinitely. Expired models will be deleted.

  expiration-time - `java.lang.Long`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo$Builder this ^java.lang.Long expiration-time]
    (-> this (.setExpirationTime expiration-time))))

(defn set-labels
  "Set the labels applied to this model.

   When used with BigQuery.update(ModelInfo, ModelOption...), setting labels
   to null removes all labels; otherwise all keys that are mapped to null values
   are removed and other keys are updated to their respective values.

  labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn set-model-id
  "model-id - `com.google.cloud.bigquery.ModelId`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo$Builder this ^com.google.cloud.bigquery.ModelId model-id]
    (-> this (.setModelId model-id))))

(defn build
  "Creates a ModelInfo object.

  returns: `com.google.cloud.bigquery.ModelInfo`"
  (^com.google.cloud.bigquery.ModelInfo [^ModelInfo$Builder this]
    (-> this (.build))))

