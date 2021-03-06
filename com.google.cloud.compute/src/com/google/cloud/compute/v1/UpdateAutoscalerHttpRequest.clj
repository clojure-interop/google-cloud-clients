(ns com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UpdateAutoscalerHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest`

  returns: `com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest$Builder [^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest prototype]
    (UpdateAutoscalerHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest$Builder []
    (UpdateAutoscalerHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest`"
  (^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest []
    (UpdateAutoscalerHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getUserIp))))

(defn get-autoscaler-resource
  "Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine
   instances in managed instance groups according to an autoscaling policy that you define. For
   more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==)
   (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (==
   resource_for v1.regionAutoscalers ==)

  returns: `com.google.cloud.compute.v1.Autoscaler`"
  (^com.google.cloud.compute.v1.Autoscaler [^UpdateAutoscalerHttpRequest this]
    (-> this (.getAutoscalerResource))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only those
   fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UpdateAutoscalerHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^UpdateAutoscalerHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-autoscaler
  "Name of the autoscaler to update.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getAutoscaler))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.Autoscaler`"
  (^com.google.cloud.compute.v1.Autoscaler [^UpdateAutoscalerHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-zone
  "Name of the zone for this request. It must have the format
   `{project}/zones/{zone}/autoscalers`. \\`{zone}\\` must start with a letter, and contain only
   letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods
   (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and
   255 characters in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getZone))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getPrettyPrint))))

(defn get-request-id
  "An optional request ID to identify requests. Specify a unique request ID so that if you must
   retry your request, the server will know to ignore the request if it has already been
   completed.

   For example, consider a situation where you make an initial request and the request times
   out. If you make the request again with the same request ID, the server can check if original
   operation with the same request ID was received, and if so, will ignore the second request.
   This prevents clients from accidentally creating duplicate commitments.

   The request ID must be a valid UUID with the exception that zero UUID is not supported
   (00000000-0000-0000-0000-000000000000).

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getRequestId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UpdateAutoscalerHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateAutoscalerHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UpdateAutoscalerHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest$Builder [^UpdateAutoscalerHttpRequest this]
    (-> this (.toBuilder))))

