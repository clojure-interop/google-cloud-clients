(ns com.google.cloud.compute.v1.PatchNetworkHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PatchNetworkHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.PatchNetworkHttpRequest`

  returns: `com.google.cloud.compute.v1.PatchNetworkHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchNetworkHttpRequest$Builder [^com.google.cloud.compute.v1.PatchNetworkHttpRequest prototype]
    (PatchNetworkHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.PatchNetworkHttpRequest$Builder []
    (PatchNetworkHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.PatchNetworkHttpRequest`"
  (^com.google.cloud.compute.v1.PatchNetworkHttpRequest []
    (PatchNetworkHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getUserIp))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only those
   fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PatchNetworkHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^PatchNetworkHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.Network`"
  (^com.google.cloud.compute.v1.Network [^PatchNetworkHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
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
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getRequestId))))

(defn get-network
  "Name of the network to update. It must have the format `{project}/global/networks/{network}`.
   \\`{network}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers
   (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus
   (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters in length, and
   it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^PatchNetworkHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchNetworkHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^PatchNetworkHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-network-resource
  "Represents a Network resource. Read Virtual Private Cloud (VPC) Network Overview for more
   information. (== resource_for v1.networks ==) (== resource_for beta.networks ==)

  returns: `com.google.cloud.compute.v1.Network`"
  (^com.google.cloud.compute.v1.Network [^PatchNetworkHttpRequest this]
    (-> this (.getNetworkResource))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.PatchNetworkHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchNetworkHttpRequest$Builder [^PatchNetworkHttpRequest this]
    (-> this (.toBuilder))))

