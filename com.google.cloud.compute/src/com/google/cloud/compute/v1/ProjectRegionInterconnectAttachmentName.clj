(ns com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInterconnectAttachmentName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionInterconnectAttachmentName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder []
    (ProjectRegionInterconnectAttachmentName/newBuilder )))

(defn *of
  "interconnect-attachment - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName [^java.lang.String interconnect-attachment ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInterconnectAttachmentName/of interconnect-attachment project region)))

(defn *format
  "interconnect-attachment - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String interconnect-attachment ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInterconnectAttachmentName/format interconnect-attachment project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionInterconnectAttachmentName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName [^java.lang.String formatted-string]
    (ProjectRegionInterconnectAttachmentName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionInterconnectAttachmentName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-interconnect-attachment
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.getInterconnectAttachment))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionInterconnectAttachmentName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName$Builder [^ProjectRegionInterconnectAttachmentName this]
    (-> this (.toBuilder))))

