(ns com.google.cloud.compute.v1.ProjectRegionCommitmentName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionCommitmentName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionCommitmentName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder []
    (ProjectRegionCommitmentName/newBuilder )))

(defn *of
  "commitment - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName [^java.lang.String commitment ^java.lang.String project ^java.lang.String region]
    (ProjectRegionCommitmentName/of commitment project region)))

(defn *format
  "commitment - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String commitment ^java.lang.String project ^java.lang.String region]
    (ProjectRegionCommitmentName/format commitment project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionCommitmentName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionCommitmentName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName [^java.lang.String formatted-string]
    (ProjectRegionCommitmentName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionCommitmentName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionCommitmentName this]
    (-> this (.getFieldValuesMap))))

(defn get-commitment
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName this]
    (-> this (.getCommitment))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionCommitmentName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionCommitmentName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionCommitmentName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionCommitmentName$Builder [^ProjectRegionCommitmentName this]
    (-> this (.toBuilder))))

