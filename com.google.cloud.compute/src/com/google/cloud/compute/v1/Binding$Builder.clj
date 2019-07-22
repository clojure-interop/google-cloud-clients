(ns com.google.cloud.compute.v1.Binding$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Binding$Builder]))

(defn get-role
  "Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   `roles/owner`.

  returns: `java.lang.String`"
  (^java.lang.String [^Binding$Builder this]
    (-> this (.getRole))))

(defn add-all-members
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

   * `domain:{domain}`: The G Suite domain (primary) that represents all the users of
   that domain. For example, `google.com` or `example.com`.

  members - `java.util.List`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this ^java.util.List members]
    (-> this (.addAllMembers members))))

(defn set-condition
  "The condition that is associated with this binding. NOTE: An unsatisfied condition will not
   allow user access via current binding. Different bindings, including their conditions, are
   examined independently.

  condition - `com.google.cloud.compute.v1.Expr`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this ^com.google.cloud.compute.v1.Expr condition]
    (-> this (.setCondition condition))))

(defn get-condition
  "The condition that is associated with this binding. NOTE: An unsatisfied condition will not
   allow user access via current binding. Different bindings, including their conditions, are
   examined independently.

  returns: `com.google.cloud.compute.v1.Expr`"
  (^com.google.cloud.compute.v1.Expr [^Binding$Builder this]
    (-> this (.getCondition))))

(defn set-role
  "Role that is assigned to `members`. For example, `roles/viewer`, `roles/editor`, or
   `roles/owner`.

  role - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this ^java.lang.String role]
    (-> this (.setRole role))))

(defn build
  "returns: `com.google.cloud.compute.v1.Binding`"
  (^com.google.cloud.compute.v1.Binding [^Binding$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Binding`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this ^com.google.cloud.compute.v1.Binding other]
    (-> this (.mergeFrom other))))

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

   * `domain:{domain}`: The G Suite domain (primary) that represents all the users of
   that domain. For example, `google.com` or `example.com`.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Binding$Builder this]
    (-> this (.getMembersList))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this]
    (-> this (.clone))))

(defn add-members
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

   * `domain:{domain}`: The G Suite domain (primary) that represents all the users of
   that domain. For example, `google.com` or `example.com`.

  members - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Binding$Builder`"
  (^com.google.cloud.compute.v1.Binding$Builder [^Binding$Builder this ^java.lang.String members]
    (-> this (.addMembers members))))

