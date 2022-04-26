/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/pubsublite/v1/subscriber.proto

package com.google.cloud.pubsublite.proto;

/**
 *
 *
 * <pre>
 * Response to an InitialSubscribeRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.pubsublite.v1.InitialSubscribeResponse}
 */
public final class InitialSubscribeResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.pubsublite.v1.InitialSubscribeResponse)
    InitialSubscribeResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InitialSubscribeResponse.newBuilder() to construct.
  private InitialSubscribeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InitialSubscribeResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InitialSubscribeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InitialSubscribeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.pubsublite.proto.Cursor.Builder subBuilder = null;
              if (cursor_ != null) {
                subBuilder = cursor_.toBuilder();
              }
              cursor_ =
                  input.readMessage(
                      com.google.cloud.pubsublite.proto.Cursor.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(cursor_);
                cursor_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_InitialSubscribeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.pubsublite.proto.SubscriberProto
        .internal_static_google_cloud_pubsublite_v1_InitialSubscribeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.pubsublite.proto.InitialSubscribeResponse.class,
            com.google.cloud.pubsublite.proto.InitialSubscribeResponse.Builder.class);
  }

  public static final int CURSOR_FIELD_NUMBER = 1;
  private com.google.cloud.pubsublite.proto.Cursor cursor_;
  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return Whether the cursor field is set.
   */
  @java.lang.Override
  public boolean hasCursor() {
    return cursor_ != null;
  }
  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   *
   * @return The cursor.
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.Cursor getCursor() {
    return cursor_ == null
        ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
        : cursor_;
  }
  /**
   *
   *
   * <pre>
   * The cursor from which the subscriber will start receiving messages once
   * flow control tokens become available.
   * </pre>
   *
   * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
    return getCursor();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (cursor_ != null) {
      output.writeMessage(1, getCursor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cursor_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getCursor());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.pubsublite.proto.InitialSubscribeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.pubsublite.proto.InitialSubscribeResponse other =
        (com.google.cloud.pubsublite.proto.InitialSubscribeResponse) obj;

    if (hasCursor() != other.hasCursor()) return false;
    if (hasCursor()) {
      if (!getCursor().equals(other.getCursor())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCursor()) {
      hash = (37 * hash) + CURSOR_FIELD_NUMBER;
      hash = (53 * hash) + getCursor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.pubsublite.proto.InitialSubscribeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response to an InitialSubscribeRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.pubsublite.v1.InitialSubscribeResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.pubsublite.v1.InitialSubscribeResponse)
      com.google.cloud.pubsublite.proto.InitialSubscribeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_InitialSubscribeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_InitialSubscribeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.pubsublite.proto.InitialSubscribeResponse.class,
              com.google.cloud.pubsublite.proto.InitialSubscribeResponse.Builder.class);
    }

    // Construct using com.google.cloud.pubsublite.proto.InitialSubscribeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cursorBuilder_ == null) {
        cursor_ = null;
      } else {
        cursor_ = null;
        cursorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.pubsublite.proto.SubscriberProto
          .internal_static_google_cloud_pubsublite_v1_InitialSubscribeResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialSubscribeResponse getDefaultInstanceForType() {
      return com.google.cloud.pubsublite.proto.InitialSubscribeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialSubscribeResponse build() {
      com.google.cloud.pubsublite.proto.InitialSubscribeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.pubsublite.proto.InitialSubscribeResponse buildPartial() {
      com.google.cloud.pubsublite.proto.InitialSubscribeResponse result =
          new com.google.cloud.pubsublite.proto.InitialSubscribeResponse(this);
      if (cursorBuilder_ == null) {
        result.cursor_ = cursor_;
      } else {
        result.cursor_ = cursorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.pubsublite.proto.InitialSubscribeResponse) {
        return mergeFrom((com.google.cloud.pubsublite.proto.InitialSubscribeResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.pubsublite.proto.InitialSubscribeResponse other) {
      if (other == com.google.cloud.pubsublite.proto.InitialSubscribeResponse.getDefaultInstance())
        return this;
      if (other.hasCursor()) {
        mergeCursor(other.getCursor());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.pubsublite.proto.InitialSubscribeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.pubsublite.proto.InitialSubscribeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.pubsublite.proto.Cursor cursor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        cursorBuilder_;
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     *
     * @return Whether the cursor field is set.
     */
    public boolean hasCursor() {
      return cursorBuilder_ != null || cursor_ != null;
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     *
     * @return The cursor.
     */
    public com.google.cloud.pubsublite.proto.Cursor getCursor() {
      if (cursorBuilder_ == null) {
        return cursor_ == null
            ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
            : cursor_;
      } else {
        return cursorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cursor_ = value;
        onChanged();
      } else {
        cursorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder setCursor(com.google.cloud.pubsublite.proto.Cursor.Builder builderForValue) {
      if (cursorBuilder_ == null) {
        cursor_ = builderForValue.build();
        onChanged();
      } else {
        cursorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder mergeCursor(com.google.cloud.pubsublite.proto.Cursor value) {
      if (cursorBuilder_ == null) {
        if (cursor_ != null) {
          cursor_ =
              com.google.cloud.pubsublite.proto.Cursor.newBuilder(cursor_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          cursor_ = value;
        }
        onChanged();
      } else {
        cursorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public Builder clearCursor() {
      if (cursorBuilder_ == null) {
        cursor_ = null;
        onChanged();
      } else {
        cursor_ = null;
        cursorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.Cursor.Builder getCursorBuilder() {

      onChanged();
      return getCursorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    public com.google.cloud.pubsublite.proto.CursorOrBuilder getCursorOrBuilder() {
      if (cursorBuilder_ != null) {
        return cursorBuilder_.getMessageOrBuilder();
      } else {
        return cursor_ == null
            ? com.google.cloud.pubsublite.proto.Cursor.getDefaultInstance()
            : cursor_;
      }
    }
    /**
     *
     *
     * <pre>
     * The cursor from which the subscriber will start receiving messages once
     * flow control tokens become available.
     * </pre>
     *
     * <code>.google.cloud.pubsublite.v1.Cursor cursor = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.pubsublite.proto.Cursor,
            com.google.cloud.pubsublite.proto.Cursor.Builder,
            com.google.cloud.pubsublite.proto.CursorOrBuilder>
        getCursorFieldBuilder() {
      if (cursorBuilder_ == null) {
        cursorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.pubsublite.proto.Cursor,
                com.google.cloud.pubsublite.proto.Cursor.Builder,
                com.google.cloud.pubsublite.proto.CursorOrBuilder>(
                getCursor(), getParentForChildren(), isClean());
        cursor_ = null;
      }
      return cursorBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.pubsublite.v1.InitialSubscribeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.pubsublite.v1.InitialSubscribeResponse)
  private static final com.google.cloud.pubsublite.proto.InitialSubscribeResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.pubsublite.proto.InitialSubscribeResponse();
  }

  public static com.google.cloud.pubsublite.proto.InitialSubscribeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitialSubscribeResponse> PARSER =
      new com.google.protobuf.AbstractParser<InitialSubscribeResponse>() {
        @java.lang.Override
        public InitialSubscribeResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InitialSubscribeResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InitialSubscribeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitialSubscribeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.pubsublite.proto.InitialSubscribeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
