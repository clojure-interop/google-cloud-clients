(ns com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetRegionDiskTypeHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest`

  returns: `com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest$Builder [^com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest prototype]
    (GetRegionDiskTypeHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest$Builder []
    (GetRegionDiskTypeHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest`"
  (^com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest []
    (GetRegionDiskTypeHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getUserIp))))

(defn get-disk-type
  "Name of the disk type to return. It must have the format
   `{project}/regions/{region}/diskTypes/{diskType}`. \\`{diskType}\\` must start with a letter, and
   contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores
   (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must
   be between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getDiskType))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetRegionDiskTypeHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetRegionDiskTypeHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetRegionDiskTypeHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetRegionDiskTypeHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetRegionDiskTypeHttpRequest$Builder [^GetRegionDiskTypeHttpRequest this]
    (-> this (.toBuilder))))

