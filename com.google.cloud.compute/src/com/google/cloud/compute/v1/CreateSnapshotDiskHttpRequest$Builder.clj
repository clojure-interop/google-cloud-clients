(ns com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CreateSnapshotDiskHttpRequest$Builder]))

(defn set-quota-user
  "Alternative to userIp.

  quota-user - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String quota-user]
    (-> this (.setQuotaUser quota-user))))

(defn set-guest-flush
  "[Input Only] Specifies to create an application consistent snapshot by informing the OS to
   prepare for the snapshot process. Currently only supported on Windows instances using the
   Volume Shadow Copy Service (VSS).

  guest-flush - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.Boolean guest-flush]
    (-> this (.setGuestFlush guest-flush))))

(defn get-user-ip
  "IP address of the end user for whom the API call is being made.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getUserIp))))

(defn set-fields
  "Selector specifying a subset of fields to include in the response.

  fields - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String fields]
    (-> this (.setFields fields))))

(defn set-callback
  "Name of the JavaScript callback function that handles the response.

  callback - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String callback]
    (-> this (.setCallback callback))))

(defn set-access-token
  "OAuth 2.0 token for the current user.

  access-token - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String access-token]
    (-> this (.setAccessToken access-token))))

(defn get-snapshot-resource
  "A persistent disk snapshot resource. (== resource_for beta.snapshots ==) (== resource_for
   v1.snapshots ==)

  returns: `com.google.cloud.compute.v1.Snapshot`"
  (^com.google.cloud.compute.v1.Snapshot [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getSnapshotResource))))

(defn get-disk
  "Name of the persistent disk to snapshot. It must have the format
   `{project}/zones/{zone}/disks/{disk}/createSnapshot`. \\`{disk}\\` must start with a letter,
   and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getDisk))))

(defn get-key
  "API key. Required unless you provide an OAuth 2.0 token.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getKey))))

(defn set-disk
  "Name of the persistent disk to snapshot. It must have the format
   `{project}/zones/{zone}/disks/{disk}/createSnapshot`. \\`{disk}\\` must start with a letter,
   and contain only letters (\\`[A-Za-z]\\`), numbers (\\`[0-9]\\`), dashes (\\`-\\`), *
   underscores (\\`_\\`), periods (\\`.\\`), tildes (\\`~\\`), plus (\\`+\\`) or percent * signs
   (\\`%\\`). It must be between 3 and 255 characters in length, and it * must not start with
   \\`\"goog\"\\`.

  disk - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String disk]
    (-> this (.setDisk disk))))

(defn set-user-ip
  "IP address of the end user for whom the API call is being made.

  user-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String user-ip]
    (-> this (.setUserIp user-ip))))

(defn build
  "returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.build))))

(defn set-snapshot-resource
  "A persistent disk snapshot resource. (== resource_for beta.snapshots ==) (== resource_for
   v1.snapshots ==)

  snapshot-resource - `com.google.cloud.compute.v1.Snapshot`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^com.google.cloud.compute.v1.Snapshot snapshot-resource]
    (-> this (.setSnapshotResource snapshot-resource))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest other]
    (-> this (.mergeFrom other))))

(defn set-key
  "API key. Required unless you provide an OAuth 2.0 token.

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-quota-user
  "Alternative to userIp.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
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

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String request-id]
    (-> this (.setRequestId request-id))))

(defn get-pretty-print
  "Returns response with indentations and line breaks.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
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
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getRequestId))))

(defn set-pretty-print
  "Returns response with indentations and line breaks.

  pretty-print - `java.lang.String`

  returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this ^java.lang.String pretty-print]
    (-> this (.setPrettyPrint pretty-print))))

(defn clone
  "returns: `com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder`"
  (^com.google.cloud.compute.v1.CreateSnapshotDiskHttpRequest$Builder [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.clone))))

(defn get-guest-flush?
  "[Input Only] Specifies to create an application consistent snapshot by informing the OS to
   prepare for the snapshot process. Currently only supported on Windows instances using the
   Volume Shadow Copy Service (VSS).

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getGuestFlush))))

(defn get-access-token
  "OAuth 2.0 token for the current user.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getAccessToken))))

(defn get-callback
  "Name of the JavaScript callback function that handles the response.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getCallback))))

(defn get-fields
  "Selector specifying a subset of fields to include in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^CreateSnapshotDiskHttpRequest$Builder this]
    (-> this (.getFields))))

