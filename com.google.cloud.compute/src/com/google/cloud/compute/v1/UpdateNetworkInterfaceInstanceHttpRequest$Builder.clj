(ns com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UpdateNetworkInterfaceInstanceHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn add-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String field-mask]
    (-> this (.addFieldMask field-mask))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn get-network-interface
  "The name of the network interface to update.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getNetworkInterface))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn set-network-interface-resource
  "A network interface resource attached to an instance.

  network-interface-resource - `com.google.cloud.compute.v1.NetworkInterface`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^com.google.cloud.compute.v1.NetworkInterface network-interface-resource]
    (-> this (.setNetworkInterfaceResource network-interface-resource))))

(defn set-network-interface
  "The name of the network interface to update.

  network-interface - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String network-interface]
    (-> this (.setNetworkInterface network-interface))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getKey))))

(defn get-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getFieldMask))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn get-instance
  "The instance name for this request. It must have the format
   `{project}/zones/{zone}/instances/{instance}/updateNetworkInterface`. \\`{instance}\\` must
   start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getInstance))))

(defn add-all-field-mask
  "The fields that should be serialized (even if they have empty values). If the containing
   message object has a non-null fieldmask, then all the fields in the field mask (and only
   those fields in the field mask) will be serialized. If the containing object does not have a
   fieldmask, then only non-empty fields will be serialized.

  field-mask - `java.util.List`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.util.List field-mask]
    (-> this (.addAllFieldMask field-mask))))

(defn build
  "returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn set-instance
  "The instance name for this request. It must have the format
   `{project}/zones/{zone}/instances/{instance}/updateNetworkInterface`. \\`{instance}\\` must
   start with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes
   (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent
   * signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not
   start with \\`\"goog\"\\`.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
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
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest$Builder [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getFields))))

(defn get-network-interface-resource
  "A network interface resource attached to an instance.

  returns: `com.google.cloud.compute.v1.NetworkInterface`"
  (^com.google.cloud.compute.v1.NetworkInterface [^UpdateNetworkInterfaceInstanceHttpRequest$Builder this]
    (-> this (.getNetworkInterfaceResource))))

