(ns com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 PatchInterconnectHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn add-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String field-mask]
    (-> this (.addFieldMask field-mask))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-interconnect
  "Name of the interconnect to update. It must have the format
   `{project}/global/interconnects/{interconnect}`. \\`{interconnect}\\` must start with a letter,
   and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  interconnect - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String interconnect]
    (-> this (.setInterconnect interconnect))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-interconnect
  "Name of the interconnect to update. It must have the format
   `{project}/global/interconnects/{interconnect}`. \\`{interconnect}\\` must start with a letter,
   and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getInterconnect))))

(defn set-interconnect-resource
  "Represents an Interconnects resource. The Interconnects resource is a dedicated connection
   between Google's network and your on-premises network. For more information, see the
   Dedicated overview page. (== resource_for v1.interconnects ==) (== resource_for
   beta.interconnects ==)

  interconnect-resource - `com.google.cloud.compute.v1.Interconnect`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^com.google.cloud.compute.v1.Interconnect interconnect-resource]
    (-> this (.setInterconnectResource interconnect-resource))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getFieldMask))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn add-all-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.util.List`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.util.List field-mask]
    (-> this (.addAllFieldMask field-mask))))

(defn build
  "returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.PatchInterconnectHttpRequest`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^com.google.cloud.compute.v1.PatchInterconnectHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getQuotaUser))))

(defn get-interconnect-resource
  "Represents an Interconnects resource. The Interconnects resource is a dedicated connection
   between Google's network and your on-premises network. For more information, see the
   Dedicated overview page. (== resource_for v1.interconnects ==) (== resource_for
   beta.interconnects ==)

  returns: `com.google.cloud.compute.v1.Interconnect`"
  (^com.google.cloud.compute.v1.Interconnect [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getInterconnectResource))))

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

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
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
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.PatchInterconnectHttpRequest$Builder [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^PatchInterconnectHttpRequest$Builder this]
    (-> this (.getFields))))

