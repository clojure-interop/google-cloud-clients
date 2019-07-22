(ns com.google.cloud.compute.v1.Commitment
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Commitment]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Commitment`

  returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^com.google.cloud.compute.v1.Commitment prototype]
    (Commitment/newBuilder prototype))
  (^com.google.cloud.compute.v1.Commitment$Builder []
    (Commitment/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Commitment`"
  (^com.google.cloud.compute.v1.Commitment []
    (Commitment/getDefaultInstance )))

(defn get-start-timestamp
  "[Output Only] Commitment start time in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getStartTimestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#commitment for commitments.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Commitment this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.toString))))

(defn get-end-timestamp
  "[Output Only] Commitment end time in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getEndTimestamp))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Commitment this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getName))))

(defn get-plan
  "The plan for this commitment, which determines duration and discount rate. The currently
   supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getPlan))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Commitment this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getSelfLink))))

(defn get-resources-list
  "A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   commitments must occur together.

  returns: `java.util.List<com.google.cloud.compute.v1.ResourceCommitment>`"
  (^java.util.List [^Commitment this]
    (-> this (.getResourcesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Commitment this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Commitment this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-status-message
  "[Output Only] An optional, human-readable explanation of the status.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getStatusMessage))))

(defn get-region
  "[Output Only] URL of the region where this commitment may be used.

  returns: `java.lang.String`"
  (^java.lang.String [^Commitment this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Commitment$Builder`"
  (^com.google.cloud.compute.v1.Commitment$Builder [^Commitment this]
    (-> this (.toBuilder))))

