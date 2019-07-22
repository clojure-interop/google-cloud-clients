(ns com.google.cloud.compute.v1.SslCertificateSettings$Builder
  "Builder for SslCertificateSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslCertificateSettings$Builder]))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder [^SslCertificateSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.SslCertificateSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.SslCertificateSettings$Builder [^SslCertificateSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-ssl-certificate-settings
  "Returns the builder for the settings used for calls to deleteSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateSettings$Builder this]
    (-> this (.deleteSslCertificateSettings))))

(defn get-ssl-certificate-settings
  "Returns the builder for the settings used for calls to getSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateSettings$Builder this]
    (-> this (.getSslCertificateSettings))))

(defn insert-ssl-certificate-settings
  "Returns the builder for the settings used for calls to insertSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateSettings$Builder this]
    (-> this (.insertSslCertificateSettings))))

(defn list-ssl-certificates-settings
  "Returns the builder for the settings used for calls to listSslCertificates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SslCertificateSettings$Builder this]
    (-> this (.listSslCertificatesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.SslCertificateSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SslCertificateSettings [^SslCertificateSettings$Builder this]
    (-> this (.build))))

