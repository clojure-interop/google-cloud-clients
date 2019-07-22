(ns com.google.cloud.compute.v1.Binding
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Binding]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Binding`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^com.google.cloud.compute.v1.Binding prototype]
    (Binding/newBuilder prototype))
  (^com.google.cloud.compute.v1.Binding$Builder []
    (Binding/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Binding`"
  (^com.google.cloud.compute.v1.Binding []
    (Binding/getDefaultInstance )))

(defn get-role
  "Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   `roles/owner`.

  returns: `java.lang.String`"
  (^java.lang.String [^Binding this]
    (-> this (.getRole))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Binding this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Binding this]
    (-> this (.toString))))

(defn get-condition
  "The condition that is associated with this binding. NOTE: An unsatisfied condition will not
   allow user access via current binding. Different bindings, including their conditions, are
   examined independently.

  returns: `com.google.cloud.compute.v1.Expr`"
  (^com.google.cloud.compute.v1.Expr [^Binding this]
    (-> this (.getCondition))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Binding this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Binding this]
    (-> this (.getApiMessageRequestBody))))

(defn get-members-list
  "Specifies the identities requesting access for a Cloud Platform resource. `members` can have
   the following values:

   * `allUsers`: A special identifier that represents anyone who is on the internet; with
   or without a Google account.

   * `allAuthenticatedUsers`: A special identifier that represents anyone who is
   authenticated with a Google account or a service account.

   * `user:{emailid}`: An email address that represents a specific Google account. For
   example, `alice@gmail.com` .

   * `serviceAccount:{emailid}`: An email address that represents a service account. For
   example, `my-other-app@appspot.gserviceaccount.com`.

   * `group:{emailid}`: An email address that represents a Google group. For example,
   `admins@example.com`.

   * `domain:{domain}`: The G Suite domain (primary) that represents all the users of that
   domain. For example, `google.com` or `example.com`.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Binding this]
    (-> this (.getMembersList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Binding this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Binding this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding this]
    (-> this (.toBuilder))))

