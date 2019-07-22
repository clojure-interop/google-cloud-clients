(ns com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetIamPolicyNodeGroupHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest`

  returns: `com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest$Builder [^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest prototype]
    (SetIamPolicyNodeGroupHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest$Builder []
    (SetIamPolicyNodeGroupHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest`"
  (^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest []
    (SetIamPolicyNodeGroupHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getUserIp))))

(defn get-resource
  "Name or id of the resource for this request. It must have the format
   `{project}/zones/{zone}/nodeGroups/{resource}/setIamPolicy`. \\`{resource}\\` must start with a
   letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getResource))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SetIamPolicyNodeGroupHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone-set-policy-request-resource
  "returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getZoneSetPolicyRequestResource))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.ZoneSetPolicyRequest`"
  (^com.google.cloud.compute.v1.ZoneSetPolicyRequest [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SetIamPolicyNodeGroupHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetIamPolicyNodeGroupHttpRequest$Builder [^SetIamPolicyNodeGroupHttpRequest this]
    (-> this (.toBuilder))))

