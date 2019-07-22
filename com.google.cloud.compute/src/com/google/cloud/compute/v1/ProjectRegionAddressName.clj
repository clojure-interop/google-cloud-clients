(ns com.google.cloud.compute.v1.ProjectRegionAddressName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionAddressName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionAddressName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName$Builder []
    (ProjectRegionAddressName/newBuilder )))

(defn *of
  "address - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAddressName`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName [^java.lang.String address ^java.lang.String project ^java.lang.String region]
    (ProjectRegionAddressName/of address project region)))

(defn *format
  "address - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String address ^java.lang.String project ^java.lang.String region]
    (ProjectRegionAddressName/format address project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionAddressName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionAddressName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAddressName`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName [^java.lang.String formatted-string]
    (ProjectRegionAddressName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionAddressName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionAddressName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName this]
    (-> this (.toString))))

(defn get-address
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName this]
    (-> this (.getAddress))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionAddressName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionAddressName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAddressName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAddressName$Builder [^ProjectRegionAddressName this]
    (-> this (.toBuilder))))

