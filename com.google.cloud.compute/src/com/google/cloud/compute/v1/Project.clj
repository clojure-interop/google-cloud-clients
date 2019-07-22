(ns com.google.cloud.compute.v1.Project
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Project]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Project`

  returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^com.google.cloud.compute.v1.Project prototype]
    (Project/newBuilder prototype))
  (^com.google.cloud.compute.v1.Project$Builder []
    (Project/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Project`"
  (^com.google.cloud.compute.v1.Project []
    (Project/getDefaultInstance )))

(defn get-xpn-project-status
  "[Output Only] The role this project has in a shared VPC configuration. Currently only HOST
   projects are differentiated.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getXpnProjectStatus))))

(defn get-default-network-tier
  "This signifies the default network tier used for configuring resources of the project and can
   only take the following values: PREMIUM, STANDARD. Initially the default network tier is
   PREMIUM.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getDefaultNetworkTier))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#project for projects.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Project this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Project this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-common-instance-metadata
  "Metadata key/value pairs available to all instances contained in this project. See Custom
   metadata for more information.

  returns: `com.google.cloud.compute.v1.Metadata`"
  (^com.google.cloud.compute.v1.Metadata [^Project this]
    (-> this (.getCommonInstanceMetadata))))

(defn get-name
  "The project ID. For example: my-example-project. Use the project ID to make requests to Compute
   Engine.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getName))))

(defn get-default-service-account
  "[Output Only] Default service account used by VMs running in this project.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getDefaultServiceAccount))))

(defn get-description
  "An optional textual description of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getDescription))))

(defn get-quotas-list
  "[Output Only] Quotas assigned to this project.

  returns: `java.util.List<com.google.cloud.compute.v1.Quota>`"
  (^java.util.List [^Project this]
    (-> this (.getQuotasList))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.
   This is not the project ID, and is just a unique ID used by Compute Engine to identify
   resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Project this]
    (-> this (.getApiMessageRequestBody))))

(defn get-enabled-features-list
  "Restricted features enabled for use on this project.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Project this]
    (-> this (.getEnabledFeaturesList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Project this]
    (-> this (.hashCode))))

(defn get-usage-export-location
  "The naming prefix for daily usage reports and the Google Cloud Storage bucket where they are
   stored.

  returns: `com.google.cloud.compute.v1.UsageExportLocation`"
  (^com.google.cloud.compute.v1.UsageExportLocation [^Project this]
    (-> this (.getUsageExportLocation))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Project this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Project this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Project$Builder`"
  (^com.google.cloud.compute.v1.Project$Builder [^Project this]
    (-> this (.toBuilder))))

