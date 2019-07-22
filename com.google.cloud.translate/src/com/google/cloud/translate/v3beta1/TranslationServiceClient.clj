(ns com.google.cloud.translate.v3beta1.TranslationServiceClient
  "Service Description: Provides natural language translation operations.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
    String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
    String model = \"\";
    String mimeType = \"\";
    DetectLanguageResponse response = translationServiceClient.detectLanguage(formattedParent, model, mimeType);
  }

  Note: close() needs to be called on the translationServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of TranslationServiceSettings to
  create(). For example:

  To customize credentials:



  TranslationServiceSettings translationServiceSettings =
      TranslationServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TranslationServiceClient translationServiceClient =
      TranslationServiceClient.create(translationServiceSettings);

  To customize the endpoint:



  TranslationServiceSettings translationServiceSettings =
      TranslationServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  TranslationServiceClient translationServiceClient =
      TranslationServiceClient.create(translationServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.v3beta1 TranslationServiceClient]))

(defn *format-glossary-name
  "Deprecated. Use the GlossaryName class instead.

  project - `java.lang.String`
  location - `java.lang.String`
  glossary - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location ^java.lang.String glossary]
    (TranslationServiceClient/formatGlossaryName project location glossary)))

(defn *format-location-name
  "Deprecated. Use the LocationName class instead.

  project - `java.lang.String`
  location - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String location]
    (TranslationServiceClient/formatLocationName project location)))

(defn *parse-project-from-glossary-name
  "Deprecated. Use the GlossaryName class instead.

  glossary-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String glossary-name]
    (TranslationServiceClient/parseProjectFromGlossaryName glossary-name)))

(defn *parse-location-from-glossary-name
  "Deprecated. Use the GlossaryName class instead.

  glossary-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String glossary-name]
    (TranslationServiceClient/parseLocationFromGlossaryName glossary-name)))

(defn *parse-glossary-from-glossary-name
  "Deprecated. Use the GlossaryName class instead.

  glossary-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String glossary-name]
    (TranslationServiceClient/parseGlossaryFromGlossaryName glossary-name)))

(defn *parse-project-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (TranslationServiceClient/parseProjectFromLocationName location-name)))

(defn *parse-location-from-location-name
  "Deprecated. Use the LocationName class instead.

  location-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String location-name]
    (TranslationServiceClient/parseLocationFromLocationName location-name)))

(defn *create
  "Constructs an instance of TranslationServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.translate.v3beta1.TranslationServiceSettings`

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.translate.v3beta1.TranslationServiceClient [^com.google.cloud.translate.v3beta1.TranslationServiceSettings settings]
    (TranslationServiceClient/create settings))
  (^com.google.cloud.translate.v3beta1.TranslationServiceClient []
    (TranslationServiceClient/create )))

(defn translate-text
  "Translates input text and returns translated text.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     List<String> contents = new ArrayList<>();
     String targetLanguageCode = \"\";
     TranslateTextRequest request = TranslateTextRequest.newBuilder()
       .addAllContents(contents)
       .setTargetLanguageCode(targetLanguageCode)
       .build();
     TranslateTextResponse response = translationServiceClient.translateText(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.translate.v3beta1.TranslateTextRequest`

  returns: `com.google.cloud.translate.v3beta1.TranslateTextResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.translate.v3beta1.TranslateTextResponse [^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.TranslateTextRequest request]
    (-> this (.translateText request))))

(defn batch-translate-text-callable
  "Translates a large volume of text in asynchronous batch mode. This function provides real-time
   output as the inputs are being processed. If caller cancels a request, the partial results (for
   an input file, it's all or nothing) may still be available on the specified output location.

   This call returns immediately and you can use google.longrunning.Operation.name to poll the
   status of the call.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String sourceLanguageCode = \"\";
     List<String> targetLanguageCodes = new ArrayList<>();
     List<InputConfig> inputConfigs = new ArrayList<>();
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     BatchTranslateTextRequest request = BatchTranslateTextRequest.newBuilder()
       .setSourceLanguageCode(sourceLanguageCode)
       .addAllTargetLanguageCodes(targetLanguageCodes)
       .addAllInputConfigs(inputConfigs)
       .setOutputConfig(outputConfig)
       .build();
     ApiFuture<Operation> future = translationServiceClient.batchTranslateTextCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.batchTranslateTextCallable))))

(defn list-glossaries
  "Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String filter = \"\";
     for (Glossary element : translationServiceClient.listGlossaries(formattedParent, filter).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The name of the project from which to list all of the glossaries. - `java.lang.String`
  filter - Optional. Filter specifying constraints of a list operation. Filtering is not supported yet, and the parameter currently has no effect. If missing, no filtering is performed. - `java.lang.String`

  returns: `com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse [^TranslationServiceClient this ^java.lang.String parent ^java.lang.String filter]
    (-> this (.listGlossaries parent filter)))
  (^com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse [^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.ListGlossariesRequest request]
    (-> this (.listGlossaries request))))

(defn get-settings
  "returns: `com.google.cloud.translate.v3beta1.TranslationServiceSettings`"
  (^com.google.cloud.translate.v3beta1.TranslationServiceSettings [^TranslationServiceClient this]
    (-> this (.getSettings))))

(defn batch-translate-text-async
  "Translates a large volume of text in asynchronous batch mode. This function provides real-time
   output as the inputs are being processed. If caller cancels a request, the partial results (for
   an input file, it's all or nothing) may still be available on the specified output location.

   This call returns immediately and you can use google.longrunning.Operation.name to poll the
   status of the call.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String sourceLanguageCode = \"\";
     List<String> targetLanguageCodes = new ArrayList<>();
     List<InputConfig> inputConfigs = new ArrayList<>();
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     BatchTranslateTextRequest request = BatchTranslateTextRequest.newBuilder()
       .setSourceLanguageCode(sourceLanguageCode)
       .addAllTargetLanguageCodes(targetLanguageCodes)
       .addAllInputConfigs(inputConfigs)
       .setOutputConfig(outputConfig)
       .build();
     BatchTranslateResponse response = translationServiceClient.batchTranslateTextAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.translate.v3beta1.BatchTranslateTextRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.BatchTranslateTextRequest request]
    (-> this (.batchTranslateTextAsync request))))

(defn get-glossary
  "Gets a glossary. Returns NOT_FOUND, if the glossary doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedName = TranslationServiceClient.formatGlossaryName(\"[PROJECT]\", \"[LOCATION]\", \"[GLOSSARY]\");
     Glossary response = translationServiceClient.getGlossary(formattedName);
   }

  name - Required. The name of the glossary to retrieve. - `java.lang.String`

  returns: `com.google.cloud.translate.v3beta1.Glossary`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.translate.v3beta1.Glossary [^TranslationServiceClient this ^java.lang.String name]
    (-> this (.getGlossary name))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.translate.v3beta1.stub.TranslationServiceStub`"
  ([^TranslationServiceClient this]
    (-> this (.getStub))))

(defn translate-text-callable
  "Translates input text and returns translated text.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     List<String> contents = new ArrayList<>();
     String targetLanguageCode = \"\";
     TranslateTextRequest request = TranslateTextRequest.newBuilder()
       .addAllContents(contents)
       .setTargetLanguageCode(targetLanguageCode)
       .build();
     ApiFuture<TranslateTextResponse> future = translationServiceClient.translateTextCallable().futureCall(request);
     // Do something
     TranslateTextResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.TranslateTextRequest,com.google.cloud.translate.v3beta1.TranslateTextResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.translateTextCallable))))

(defn delete-glossary-operation-callable
  "Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns
   NOT_FOUND, if the glossary doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedName = TranslationServiceClient.formatGlossaryName(\"[PROJECT]\", \"[LOCATION]\", \"[GLOSSARY]\");
     DeleteGlossaryRequest request = DeleteGlossaryRequest.newBuilder()
       .setName(formattedName)
       .build();
     OperationFuture<DeleteGlossaryResponse, DeleteGlossaryMetadata> future = translationServiceClient.deleteGlossaryOperationCallable().futureCall(request);
     // Do something
     DeleteGlossaryResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`"
  ([^TranslationServiceClient this]
    (-> this (.deleteGlossaryOperationCallable))))

(defn create-glossary-operation-callable
  "Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project
   doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     Glossary glossary = Glossary.newBuilder().build();
     CreateGlossaryRequest request = CreateGlossaryRequest.newBuilder()
       .setParent(formattedParent)
       .setGlossary(glossary)
       .build();
     OperationFuture<Glossary, CreateGlossaryMetadata> future = translationServiceClient.createGlossaryOperationCallable().futureCall(request);
     // Do something
     Glossary response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`"
  ([^TranslationServiceClient this]
    (-> this (.createGlossaryOperationCallable))))

(defn get-glossary-callable
  "Gets a glossary. Returns NOT_FOUND, if the glossary doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedName = TranslationServiceClient.formatGlossaryName(\"[PROJECT]\", \"[LOCATION]\", \"[GLOSSARY]\");
     GetGlossaryRequest request = GetGlossaryRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Glossary> future = translationServiceClient.getGlossaryCallable().futureCall(request);
     // Do something
     Glossary response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetGlossaryRequest,com.google.cloud.translate.v3beta1.Glossary>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.getGlossaryCallable))))

(defn delete-glossary-callable
  "Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns
   NOT_FOUND, if the glossary doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedName = TranslationServiceClient.formatGlossaryName(\"[PROJECT]\", \"[LOCATION]\", \"[GLOSSARY]\");
     DeleteGlossaryRequest request = DeleteGlossaryRequest.newBuilder()
       .setName(formattedName)
       .build();
     ApiFuture<Operation> future = translationServiceClient.deleteGlossaryCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DeleteGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.deleteGlossaryCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TranslationServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TranslationServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-glossary-async
  "Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns
   NOT_FOUND, if the glossary doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedName = TranslationServiceClient.formatGlossaryName(\"[PROJECT]\", \"[LOCATION]\", \"[GLOSSARY]\");
     DeleteGlossaryResponse response = translationServiceClient.deleteGlossaryAsync(formattedName).get();
   }

  name - Required. The name of the glossary to delete. - `java.lang.String`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.translate.v3beta1.DeleteGlossaryResponse,com.google.cloud.translate.v3beta1.DeleteGlossaryMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^TranslationServiceClient this ^java.lang.String name]
    (-> this (.deleteGlossaryAsync name))))

(defn shutdown
  ""
  ([^TranslationServiceClient this]
    (-> this (.shutdown))))

(defn get-supported-languages
  "Returns a list of supported languages for translation.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String displayLanguageCode = \"\";
     String model = \"\";
     SupportedLanguages response = translationServiceClient.getSupportedLanguages(formattedParent, displayLanguageCode, model);
   }

  parent - Required. Location to make a regional or global call. Format: `projects/{project-id}/locations/{location-id}`. For global calls, use `projects/{project-id}/locations/global`. Only models within the same region (have same location-id) can be used, otherwise an INVALID_ARGUMENT (400) error is returned. - `java.lang.String`
  display-language-code - Optional. The language to use to return localized, human readable names of supported languages. If missing, then display names are not returned in a response. - `java.lang.String`
  model - Optional. Get supported languages of this model. The format depends on model type: - AutoML Translation models: `projects/{project-id}/locations/{location-id}/models/{model-id}` - General (built-in) models: `projects/{project-id}/locations/{location-id}/models/general/nmt`, `projects/{project-id}/locations/{location-id}/models/general/base` Returns languages supported by the specified model. If missing, we get supported languages of Google general base (PBMT) model. - `java.lang.String`

  returns: `com.google.cloud.translate.v3beta1.SupportedLanguages`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.translate.v3beta1.SupportedLanguages [^TranslationServiceClient this ^java.lang.String parent ^java.lang.String display-language-code ^java.lang.String model]
    (-> this (.getSupportedLanguages parent display-language-code model)))
  (^com.google.cloud.translate.v3beta1.SupportedLanguages [^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest request]
    (-> this (.getSupportedLanguages request))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^TranslationServiceClient this]
    (-> this (.getOperationsClient))))

(defn create-glossary-async
  "Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project
   doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     Glossary glossary = Glossary.newBuilder().build();
     Glossary response = translationServiceClient.createGlossaryAsync(formattedParent, glossary).get();
   }

  parent - Required. The project name. - `java.lang.String`
  glossary - Required. The glossary to create. - `com.google.cloud.translate.v3beta1.Glossary`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.translate.v3beta1.Glossary,com.google.cloud.translate.v3beta1.CreateGlossaryMetadata>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^TranslationServiceClient this ^java.lang.String parent ^com.google.cloud.translate.v3beta1.Glossary glossary]
    (-> this (.createGlossaryAsync parent glossary)))
  ([^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.CreateGlossaryRequest request]
    (-> this (.createGlossaryAsync request))))

(defn list-glossaries-paged-callable
  "Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     ListGlossariesRequest request = ListGlossariesRequest.newBuilder().build();
     ApiFuture<ListGlossariesPagedResponse> future = translationServiceClient.listGlossariesPagedCallable().futureCall(request);
     // Do something
     for (Glossary element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.TranslationServiceClient$ListGlossariesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.listGlossariesPagedCallable))))

(defn close
  ""
  ([^TranslationServiceClient this]
    (-> this (.close))))

(defn get-supported-languages-callable
  "Returns a list of supported languages for translation.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     GetSupportedLanguagesRequest request = GetSupportedLanguagesRequest.newBuilder().build();
     ApiFuture<SupportedLanguages> future = translationServiceClient.getSupportedLanguagesCallable().futureCall(request);
     // Do something
     SupportedLanguages response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.GetSupportedLanguagesRequest,com.google.cloud.translate.v3beta1.SupportedLanguages>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.getSupportedLanguagesCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TranslationServiceClient this]
    (-> this (.isTerminated))))

(defn detect-language
  "Detects the language of text within a request.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     String model = \"\";
     String mimeType = \"\";
     DetectLanguageResponse response = translationServiceClient.detectLanguage(formattedParent, model, mimeType);
   }

  parent - Required. Location to make a regional or global call. Format: `projects/{project-id}/locations/{location-id}`. For global calls, use `projects/{project-id}/locations/global`. Only models within the same region (has same location-id) can be used. Otherwise an INVALID_ARGUMENT (400) error is returned. - `java.lang.String`
  model - Optional. The language detection model to be used. Format: `projects/{project-id}/locations/{location-id}/models/language-detection/{model-id}` Only one language detection model is currently supported: `projects/{project-id}/locations/{location-id}/models/language-detection/default`. If not specified, the default model is used. - `java.lang.String`
  mime-type - Optional. The format of the source text, for example, \"text/html\", \"text/plain\". If left blank, the MIME type defaults to \"text/html\". - `java.lang.String`

  returns: `com.google.cloud.translate.v3beta1.DetectLanguageResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.translate.v3beta1.DetectLanguageResponse [^TranslationServiceClient this ^java.lang.String parent ^java.lang.String model ^java.lang.String mime-type]
    (-> this (.detectLanguage parent model mime-type)))
  (^com.google.cloud.translate.v3beta1.DetectLanguageResponse [^TranslationServiceClient this ^com.google.cloud.translate.v3beta1.DetectLanguageRequest request]
    (-> this (.detectLanguage request))))

(defn detect-language-callable
  "Detects the language of text within a request.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     DetectLanguageRequest request = DetectLanguageRequest.newBuilder().build();
     ApiFuture<DetectLanguageResponse> future = translationServiceClient.detectLanguageCallable().futureCall(request);
     // Do something
     DetectLanguageResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.DetectLanguageRequest,com.google.cloud.translate.v3beta1.DetectLanguageResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.detectLanguageCallable))))

(defn list-glossaries-callable
  "Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     ListGlossariesRequest request = ListGlossariesRequest.newBuilder().build();
     while (true) {
       ListGlossariesResponse response = translationServiceClient.listGlossariesCallable().call(request);
       for (Glossary element : response.getGlossariesList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.ListGlossariesRequest,com.google.cloud.translate.v3beta1.ListGlossariesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.listGlossariesCallable))))

(defn shutdown-now
  ""
  ([^TranslationServiceClient this]
    (-> this (.shutdownNow))))

(defn create-glossary-callable
  "Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project
   doesn't exist.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String formattedParent = TranslationServiceClient.formatLocationName(\"[PROJECT]\", \"[LOCATION]\");
     Glossary glossary = Glossary.newBuilder().build();
     CreateGlossaryRequest request = CreateGlossaryRequest.newBuilder()
       .setParent(formattedParent)
       .setGlossary(glossary)
       .build();
     ApiFuture<Operation> future = translationServiceClient.createGlossaryCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.translate.v3beta1.CreateGlossaryRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TranslationServiceClient this]
    (-> this (.createGlossaryCallable))))

(defn batch-translate-text-operation-callable
  "Translates a large volume of text in asynchronous batch mode. This function provides real-time
   output as the inputs are being processed. If caller cancels a request, the partial results (for
   an input file, it's all or nothing) may still be available on the specified output location.

   This call returns immediately and you can use google.longrunning.Operation.name to poll the
   status of the call.

   Sample code:



   try (TranslationServiceClient translationServiceClient = TranslationServiceClient.create()) {
     String sourceLanguageCode = \"\";
     List<String> targetLanguageCodes = new ArrayList<>();
     List<InputConfig> inputConfigs = new ArrayList<>();
     OutputConfig outputConfig = OutputConfig.newBuilder().build();
     BatchTranslateTextRequest request = BatchTranslateTextRequest.newBuilder()
       .setSourceLanguageCode(sourceLanguageCode)
       .addAllTargetLanguageCodes(targetLanguageCodes)
       .addAllInputConfigs(inputConfigs)
       .setOutputConfig(outputConfig)
       .build();
     OperationFuture<BatchTranslateResponse, BatchTranslateMetadata> future = translationServiceClient.batchTranslateTextOperationCallable().futureCall(request);
     // Do something
     BatchTranslateResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.translate.v3beta1.BatchTranslateTextRequest,com.google.cloud.translate.v3beta1.BatchTranslateResponse,com.google.cloud.translate.v3beta1.BatchTranslateMetadata>`"
  ([^TranslationServiceClient this]
    (-> this (.batchTranslateTextOperationCallable))))

