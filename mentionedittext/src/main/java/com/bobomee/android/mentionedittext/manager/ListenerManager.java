package com.bobomee.android.mentionedittext.manager;

import com.bobomee.android.mentionedittext.listener.OnMentionInput;
import com.bobomee.android.mentionedittext.listener.OnMentionInputListener;

/**
 * Project ID：400YF17051<br/>
 * Resume:
 *
 * @author 汪波
 * @version 1.0
 * @see
 * @since 2017/4/2 汪波 first commit
 */
public enum ListenerManager {

  INSTANCE;

  private OnMentionInput mOnMentionInput = new OnMentionInput();

  public void addOnMentionInputListener(OnMentionInputListener mentionInputListener) {
    mOnMentionInput.addListener(mentionInputListener);
  }

  public void notifyMentionCharacterInput(char c) {
    mOnMentionInput.onMentionCharacterInput(c);
  }

  private char mentionChar = '@';

  private char mTagChar = '#';

  public char getMentionChar() {
    return mentionChar;
  }

  public void setMentionChar(char mentionChar) {
    this.mentionChar = mentionChar;
  }

  public char getTagChar() {
    return mTagChar;
  }

  public void setTagChar(char tagChar) {
    mTagChar = tagChar;
  }

  private  String mMentionTextFormat = "(@%s:%s)";

  private String mTagTextFormat ="[#%s:%s]";

  public String getMentionTextFormat() {
    return mMentionTextFormat;
  }

  public void setMentionTextFormat(String mentionTextFormat) {
    mMentionTextFormat = mentionTextFormat;
  }

  public String getTagTextFormat() {
    return mTagTextFormat;
  }

  public void setTagTextFormat(String tagTextFormat) {
    mTagTextFormat = tagTextFormat;
  }
}
