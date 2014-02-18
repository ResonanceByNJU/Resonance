package com.example.resonance.view.widget;

import com.example.resonance.R;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/**
 *Class <code>CustomDialog.java</code> �Զ���Dialog.
 *
 * @author never
 * @date 2014-2-10
 */
public class CustomDialog extends Dialog {
	//ʵ��Ĭ�Ϲ��캯��
	public CustomDialog(Context context, int theme) {
        super(context, theme);
	}

	protected CustomDialog(Context context, boolean cancelable,
	        OnCancelListener cancelListener) {
	    super(context, cancelable, cancelListener);
	}

	public CustomDialog(Context context) {
	    super(context);

	}
	//���еķ���ִ���궼�᷵��һ��Builderʹ�ú������ֱ��create��show
	 public static class Builder {
	        private Context context;
	        private String title;
	        private String message;
	        private String positiveButtonText;//ȷ����ť
	        private String negativeButtonText;//ȡ����ť
	        private View contentView;
	        //ȷ����ť�¼�
	        private DialogInterface.OnClickListener positiveButtonClickListener;
	        //ȡ����ť�¼�
	        private DialogInterface.OnClickListener negativeButtonClickListener;
	        //listview��item����¼�

	       public Builder(Context context) {
	            this.context = context;
	        }
	        //������Ϣ
	        public Builder setMessage(String message) {
	            this.message = message;
	            return this;
	        }

	        /**
	         *��������
	         * 
	         * @param title
	         * @return
	         */
	        public Builder setMessage(int message) {
	            this.message = (String) context.getText(message);
	            return this;
	        }

	        /**
	         * ���ñ���
	         * 
	         * @param title
	         * @return
	         */
	        public Builder setTitle(int title) {
	            this.title = (String) context.getText(title);
	            return this;
	        }

	        /**
	         *���ñ���
	         * 
	         * @param title
	         * @return
	         */

	        public Builder setTitle(String title) {
	            this.title = title;
	            return this;
	        }
	        //������������
	        public Builder setContentView(View v) {
	            this.contentView = v;
	            return this;
	        }
	        /**
	         * ����ȷ����ť�������¼�
	         * 
	         * @param positiveButtonText
	         * @return
	         */
	        public Builder setPositiveButton(int positiveButtonText,
	                DialogInterface.OnClickListener listener) {
	            this.positiveButtonText = (String) context
	                    .getText(positiveButtonText);
	            this.positiveButtonClickListener = listener;
	            return this;
	        }

	        public Builder setPositiveButton(String positiveButtonText,
	                DialogInterface.OnClickListener listener) {
	            this.positiveButtonText = positiveButtonText;
	            this.positiveButtonClickListener = listener;
	            return this;
	        }
	        //����ȡ����ť�����¼�
	        public Builder setNegativeButton(int negativeButtonText,
	                DialogInterface.OnClickListener listener) {
	            this.negativeButtonText = (String) context
	                    .getText(negativeButtonText);
	            this.negativeButtonClickListener = listener;
	            return this;
	        }

	        public Builder setNegativeButton(String negativeButtonText,
	                DialogInterface.OnClickListener listener) {
	            this.negativeButtonText = negativeButtonText;
	            this.negativeButtonClickListener = listener;
	            return this;
	        }
	    //createview����
	        public CustomDialog create() {
	            LayoutInflater inflater = (LayoutInflater) context
	                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            // ��������
	            final CustomDialog dialog = new CustomDialog(context,R.style.MyDialog);
	            View layout = inflater.inflate(R.layout.exit_dialog, null);
	            dialog.addContentView(layout, new LayoutParams(
	                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	            // ���ñ���
	            ((TextView) layout.findViewById(R.id.dialog_title_textview)).setText(title);


	            //����ȷ����ť
	            if (positiveButtonText != null) {
	                ((Button) layout.findViewById(R.id.dialog_confirm_button))
	                        .setText(positiveButtonText);
	                if (positiveButtonClickListener != null) {
	                    ((Button) layout.findViewById(R.id.dialog_confirm_button))
	                            .setOnClickListener(new View.OnClickListener() {
	                                public void onClick(View v) {
	                                    positiveButtonClickListener.onClick(dialog,
	                                            DialogInterface.BUTTON_POSITIVE);
	                                }
	                            });
	                }
	            } else {
	                 // ���û��ȷ����ť�ͽ�������
	                layout.findViewById(R.id.dialog_confirm_button).setVisibility(
	                        View.GONE);
	            }
	            // ����ȡ����ť
	            if (negativeButtonText != null) {
	                ((Button) layout.findViewById(R.id.dialog_cancel_button))
	                        .setText(negativeButtonText);
	                if (negativeButtonClickListener != null) {
	                    ((Button) layout.findViewById(R.id.dialog_cancel_button))
	                            .setOnClickListener(new View.OnClickListener() {
	                                public void onClick(View v) {
	                                    negativeButtonClickListener.onClick(dialog,
	                                            DialogInterface.BUTTON_NEGATIVE);
	                                }
	                            });
	                }
	            } else {
	                // ���û��ȡ����ť�ͽ�������
	                layout.findViewById(R.id.dialog_cancel_button).setVisibility(
	                        View.GONE);
	            }
	            // ��������
	            if (message != null) {
	                ((TextView) layout.findViewById(R.id.dialog_content_textview)).setText(message);
	            } else if (contentView != null) {
	                // if no message set
	                // ���view
	                ((LinearLayout) layout.findViewById(R.id.dialog_content_textview))
	                        .removeAllViews();
	                ((LinearLayout) layout.findViewById(R.id.dialog_content_textview)).addView(
	                        contentView, new LayoutParams(
	                                LayoutParams.WRAP_CONTENT,
	                                LayoutParams.WRAP_CONTENT));
	            }
	            dialog.setContentView(layout);
	            return dialog;
	        }

	    }
	}