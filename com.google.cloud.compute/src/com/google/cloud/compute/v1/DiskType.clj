(ns com.google.cloud.compute.v1.DiskType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DiskType]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.DiskType`

  returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^com.google.cloud.compute.v1.DiskType prototype]
    (DiskType/newBuilder prototype))
  (^com.google.cloud.compute.v1.DiskType$Builder []
    (DiskType/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.DiskType`"
  (^com.google.cloud.compute.v1.DiskType []
    (DiskType/getDefaultInstance )))

(defn get-default-disk-size-gb
  "[Output Only] Server-defined default disk size in GB.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getDefaultDiskSizeGb))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#diskType for disk types.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getKind))))

(defn get-valid-disk-size
  "[Output Only] An optional textual description of the valid disk size, such as \"10GB-10TB\".

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getValidDiskSize))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^DiskType this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DiskType this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "[Output Only] Name of the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getName))))

(defn get-deprecated
  "[Output Only] The deprecation status associated with this disk type.

  returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^DiskType this]
    (-> this (.getDeprecated))))

(defn get-description
  "[Output Only] An optional description of this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^DiskType this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getSelfLink))))

(defn get-zone
  "[Output Only] URL of the zone where the disk type resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskType this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskType this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the disk type resides. Only applicable for regional
   resources. You must specify this field as part of the HTTP request URL. It is not settable as a
   field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskType this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.DiskType$Builder`"
  (^com.google.cloud.compute.v1.DiskType$Builder [^DiskType this]
    (-> this (.toBuilder))))

