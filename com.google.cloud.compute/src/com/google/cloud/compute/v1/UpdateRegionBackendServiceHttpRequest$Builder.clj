(ns com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UpdateRegionBackendServiceHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn add-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String field-mask]
    (-> this (.addFieldMask field-mask))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-backend-service
  "Name of the BackendService resource to update. It must have the format
   `{project}/regions/{region}/backendServices/{backendService}`. \\`{backendService}\\` must
   start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  backend-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String backend-service]
    (-> this (.setBackendService backend-service))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn set-backend-service-resource
  "A BackendService resource. This resource defines a group of backend virtual machines and
   their serving capacity. (== resource_for v1.backendService ==) (== resource_for
   beta.backendService ==)

  backend-service-resource - `com.google.cloud.compute.v1.BackendService`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^com.google.cloud.compute.v1.BackendService backend-service-resource]
    (-> this (.setBackendServiceResource backend-service-resource))))

(defn get-backend-service
  "Name of the BackendService resource to update. It must have the format
   `{project}/regions/{region}/backendServices/{backendService}`. \\`{backendService}\\` must
   start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getBackendService))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getFieldMask))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn add-all-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.util.List`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.util.List field-mask]
    (-> this (.addAllFieldMask field-mask))))

(defn build
  "returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn set-request-id
  "An optional request ID to identify requests. Specify a unique request ID so that if you must
   retry your request, the server will know to ignore the request if it has already been
   completed.

   For example, consider a situation where you make an initial request and the request times
   out. If you make the request again with the same request ID, the server can check if original
   operation with the same request ID was received, and if so, will ignore the second request.
   This prevents clients from accidentally creating duplicate commitments.

   The request ID must be a valid UUID with the exception that zero UUID is not supported
   (00000000-0000-0000-0000-000000000000).

  request-id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
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
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateRegionBackendServiceHttpRequest$Builder [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getFields))))

(defn get-backend-service-resource
  "A BackendService resource. This resource defines a group of backend virtual machines and
   their serving capacity. (== resource_for v1.backendService ==) (== resource_for
   beta.backendService ==)

  returns: `com.google.cloud.compute.v1.BackendService`"
  (^com.google.cloud.compute.v1.BackendService [^UpdateRegionBackendServiceHttpRequest$Builder this]
    (-> this (.getBackendServiceResource))))

