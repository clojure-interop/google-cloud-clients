(ns com.google.cloud.compute.v1.InsertRouteHttpRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InsertRouteHttpRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InsertRouteHttpRequest`

  returns: `com.google.cloud.compute.v1.InsertRouteHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.InsertRouteHttpRequest$Builder [^com.google.cloud.compute.v1.InsertRouteHttpRequest prototype]
    (InsertRouteHttpRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InsertRouteHttpRequest$Builder []
    (InsertRouteHttpRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InsertRouteHttpRequest`"
  (^com.google.cloud.compute.v1.InsertRouteHttpRequest []
    (InsertRouteHttpRequest/getDefaultInstance )))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getUserIp))))

(defn get-project
  "Project ID for this request. It must have the format `{project}/global/routes`. \\`{project}\\`
   must start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getProject))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getKey))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InsertRouteHttpRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InsertRouteHttpRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-route-resource
  "Represents a Route resource. A route specifies how certain packets should be handled by the
   network. Routes are associated with instances by tags and the set of routes for a particular
   instance is called its routing table.

   For each packet leaving an instance, the system searches that instance's routing table for a
   single best matching route. Routes match packets by destination IP address, preferring smaller
   or more specific ranges over larger ones. If there is a tie, the system selects the route with
   the smallest priority value. If there is still a tie, it uses the layer three and four packet
   headers to select just one of the remaining matching routes. The packet is then forwarded as
   specified by the nextHop field of the winning route - either to another instance destination,
   an instance gateway, or a Google Compute Engine-operated gateway.

   Packets that do not match any route in the sending instance's routing table are dropped. (==
   resource_for beta.routes ==) (== resource_for v1.routes ==)

  returns: `com.google.cloud.compute.v1.Route`"
  (^com.google.cloud.compute.v1.Route [^InsertRouteHttpRequest this]
    (-> this (.getRouteResource))))

(defn get-api-message-request-body
  "returns: `com.google.cloud.compute.v1.Route`"
  (^com.google.cloud.compute.v1.Route [^InsertRouteHttpRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getQuotaUser))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
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
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getRequestId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InsertRouteHttpRequest this]
    (-> this (.hashCode))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^InsertRouteHttpRequest this]
    (-> this (.getFields))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InsertRouteHttpRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InsertRouteHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.InsertRouteHttpRequest$Builder [^InsertRouteHttpRequest this]
    (-> this (.toBuilder))))

