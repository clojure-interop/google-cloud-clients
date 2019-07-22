(ns com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SetNodeTemplateNodeGroupHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn set-node-groups-set-node-template-request-resource
  "node-groups-set-node-template-request-resource - `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest node-groups-set-node-template-request-resource]
    (-> this (.setNodeGroupsSetNodeTemplateRequestResource node-groups-set-node-template-request-resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest other]
    (-> this (.mergeFrom other))))

(defn get-node-group
  "Name of the NodeGroup resource to update. It must have the format
   `{project}/zones/{zone}/nodeGroups/{nodeGroup}/setNodeTemplate`. \\`{nodeGroup}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getNodeGroup))))

(defn get-node-groups-set-node-template-request-resource
  "returns: `com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest`"
  (^com.google.cloud.compute.v1.NodeGroupsSetNodeTemplateRequest [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getNodeGroupsSetNodeTemplateRequestResource))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
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
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn set-node-group
  "Name of the NodeGroup resource to update. It must have the format
   `{project}/zones/{zone}/nodeGroups/{nodeGroup}/setNodeTemplate`. \\`{nodeGroup}\\` must start
   with a letter, and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`),
   * underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent *
   signs (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start
   with \\`\"goog\"\\`.

  node-group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.SetNodeTemplateNodeGroupHttpRequest$Builder [^SetNodeTemplateNodeGroupHttpRequest$Builder this ^java.lang.String node-group]
    (-> this (.setNodeGroup node-group))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^SetNodeTemplateNodeGroupHttpRequest$Builder this]
    (-> this (.getFields))))

