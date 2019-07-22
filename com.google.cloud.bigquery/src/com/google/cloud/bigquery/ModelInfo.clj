(ns com.google.cloud.bigquery.ModelInfo
  "Google BigQuery ML model information. Models are not created directly via the API, but by issuing
  a CREATE MODEL query."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery ModelInfo]))

(defn *new-builder
  "Returns a builder for a ModelInfo object given table identity.

  model-id - `com.google.cloud.bigquery.ModelId`

  returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^com.google.cloud.bigquery.ModelId model-id]
    (ModelInfo/newBuilder model-id)))

(defn *of
  "Returns a ModelInfo object given table identity.

  model-id - `com.google.cloud.bigquery.ModelId`

  returns: `com.google.cloud.bigquery.ModelInfo`"
  (^com.google.cloud.bigquery.ModelInfo [^com.google.cloud.bigquery.ModelId model-id]
    (ModelInfo/of model-id)))

(defn get-model-type
  "Returns the type of the ML model.

  returns: `java.lang.String`"
  (^java.lang.String [^ModelInfo this]
    (-> this (.getModelType))))

(defn get-friendly-name
  "Returns the user-friendly name for the model.

  returns: `java.lang.String`"
  (^java.lang.String [^ModelInfo this]
    (-> this (.getFriendlyName))))

(defn get-label-columns
  "Returns information about the label columns for this model.

  returns: `com.google.common.collect.ImmutableList<com.google.api.services.bigquery.model.StandardSqlField>`"
  (^com.google.common.collect.ImmutableList [^ModelInfo this]
    (-> this (.getLabelColumns))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelInfo this]
    (-> this (.toString))))

(defn get-etag
  "Returns the hash of the model resource.

  returns: `java.lang.String`"
  (^java.lang.String [^ModelInfo this]
    (-> this (.getEtag))))

(defn get-description
  "Returns the user description of the model.

  returns: `java.lang.String`"
  (^java.lang.String [^ModelInfo this]
    (-> this (.getDescription))))

(defn get-model-id
  "Returns the model identity.

  returns: `com.google.cloud.bigquery.ModelId`"
  (^com.google.cloud.bigquery.ModelId [^ModelInfo this]
    (-> this (.getModelId))))

(defn get-labels
  "Returns a map for labels applied to the model.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ModelInfo this]
    (-> this (.getLabels))))

(defn get-feature-columns
  "Returns information about the feature columns for this model.

  returns: `com.google.common.collect.ImmutableList<com.google.api.services.bigquery.model.StandardSqlField>`"
  (^com.google.common.collect.ImmutableList [^ModelInfo this]
    (-> this (.getFeatureColumns))))

(defn get-last-modified-time
  "Returns the time when this table was last modified, in milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ModelInfo this]
    (-> this (.getLastModifiedTime))))

(defn get-expiration-time
  "Returns this this model expires, in milliseconds since the epoch. If not present, the model
   will persist indefinitely. Expired models will be deleted.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ModelInfo this]
    (-> this (.getExpirationTime))))

(defn get-training-runs
  "Returns metadata about each training run iteration.

  returns: `com.google.common.collect.ImmutableList<com.google.api.services.bigquery.model.TrainingRun>`"
  (^com.google.common.collect.ImmutableList [^ModelInfo this]
    (-> this (.getTrainingRuns))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ModelInfo this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModelInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-creation-time
  "Returns the time when this model was created, in milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^ModelInfo this]
    (-> this (.getCreationTime))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.ModelInfo$Builder`"
  (^com.google.cloud.bigquery.ModelInfo$Builder [^ModelInfo this]
    (-> this (.toBuilder))))

