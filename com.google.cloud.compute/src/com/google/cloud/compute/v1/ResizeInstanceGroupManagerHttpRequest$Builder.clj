(ns com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ResizeInstanceGroupManagerHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-instance-group-manager
  "The name of the managed instance group. It must have the format
   `{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/resize`.
   \\`{instanceGroupManager}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`),
   numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes
   (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters
   in length, and it * must not start with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getInstanceGroupManager))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn build
  "returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
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
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-size
  "The number of running instances that the managed instance group should maintain at any given
   time. The group automatically adds or removes instances to maintain the number of instances
   specified by this parameter.

  size - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.Integer size]
    (-> this (.setSize size))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getFields))))

(defn get-size
  "The number of running instances that the managed instance group should maintain at any given
   time. The group automatically adds or removes instances to maintain the number of instances
   specified by this parameter.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ResizeInstanceGroupManagerHttpRequest$Builder this]
    (-> this (.getSize))))

(defn set-instance-group-manager
  "The name of the managed instance group. It must have the format
   `{project}/zones/{zone}/instanceGroupManagers/{instanceGroupManager}/resize`.
   \\`{instanceGroupManager}\\` must start with a letter, and contain only letters (\\`[A-Za-z]\\`),
   numbers (\\`[0-9]\\`), dashes (\\`-\\`), * underscores (\\`_\\`), periods (\\`.\\`), tildes
   (\\`~\\`), plus (\\`+\\`) or percent * signs (\\`%\\`). It must be between 3 and 255 characters
   in length, and it * must not start with \\`\"goog\"\\`.

  instance-group-manager - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest$Builder [^ResizeInstanceGroupManagerHttpRequest$Builder this ^java.lang.String instance-group-manager]
    (-> this (.setInstanceGroupManager instance-group-manager))))

