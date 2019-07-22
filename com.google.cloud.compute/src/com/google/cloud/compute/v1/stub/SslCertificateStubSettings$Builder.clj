(ns com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder
  "Builder for SslCertificateStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SslCertificateStubSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings$Builder [^SslCertificateStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SslCertificateStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn delete-ssl-certificate-settings
  "Returns the builder for the settings used for calls to deleteSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateStubSettings$Builder this]
    (-> this (.deleteSslCertificateSettings))))

(defn get-ssl-certificate-settings
  "Returns the builder for the settings used for calls to getSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateStubSettings$Builder this]
    (-> this (.getSslCertificateSettings))))

(defn insert-ssl-certificate-settings
  "Returns the builder for the settings used for calls to insertSslCertificate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SslCertificateStubSettings$Builder this]
    (-> this (.insertSslCertificateSettings))))

(defn list-ssl-certificates-settings
  "Returns the builder for the settings used for calls to listSslCertificates.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SslCertificateStubSettings$Builder this]
    (-> this (.listSslCertificatesSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.SslCertificateStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.SslCertificateStubSettings [^SslCertificateStubSettings$Builder this]
    (-> this (.build))))

