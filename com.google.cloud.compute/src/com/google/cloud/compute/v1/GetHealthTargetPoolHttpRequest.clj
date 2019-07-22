(ns com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 GetHealthTargetPoolHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest`

  returns: `com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest$Builder [^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest prototype]
    (GetHealthTargetPoolHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest$Builder []
    (GetHealthTargetPoolHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest`"
  (^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest []
    (GetHealthTargetPoolHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getUserIp))))

(defn get-target-pool
  "Name of the TargetPool resource to which the queried instance belongs. It must have the format
   `{project}/regions/{region}/targetPools/{targetPool}/getHealth`. \\`{targetPool}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getTargetPool))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^GetHealthTargetPoolHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.InstanceReference`"
  (^com.google.cloud.compute.v1.InstanceReference [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GetHealthTargetPoolHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GetHealthTargetPoolHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-instance-reference-resource
  "returns: `com.google.cloud.compute.v1.InstanceReference`"
  (^com.google.cloud.compute.v1.InstanceReference [^GetHealthTargetPoolHttpRequest this]
    (-> this (.getInstanceReferenceResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.GetHealthTargetPoolHttpRequest$Builder [^GetHealthTargetPoolHttpRequest this]
    (-> this (.toBuilder))))

