(ns com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetIamPolicyImageHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest`

  returns: `com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest$Builder [^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest prototype]
    (SetIamPolicyImageHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest$Builder []
    (SetIamPolicyImageHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest`"
  (^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest []
    (SetIamPolicyImageHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getUserIp))))

(defn get-resource
  "Name or id of the resource for this request. It must have the format
   `{project}/global/images/{resource}/setIamPolicy`. \\`{resource}\\` must start with a letter, and
   contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores
   (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must
   be between 3 and 255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getResource))))

(defn get-global-set-policy-request-resource
  "returns: `com.google.cloud.compute.v1.GlobalSetPolicyRequest`"
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest [^SetIamPolicyImageHttpRequest this]
    (-> this (.getGlobalSetPolicyRequestResource))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SetIamPolicyImageHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SetIamPolicyImageHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.GlobalSetPolicyRequest`"
  (^com.google.cloud.compute.v1.GlobalSetPolicyRequest [^SetIamPolicyImageHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SetIamPolicyImageHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetIamPolicyImageHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SetIamPolicyImageHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest$Builder [^SetIamPolicyImageHttpRequest this]
    (-> this (.toBuilder))))

