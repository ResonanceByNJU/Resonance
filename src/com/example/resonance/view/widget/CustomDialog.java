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
 *Class <code>CustomDialog.java</code> 自定义Dialog.
 *
 * @author never
 * @date 2014-2-10
 */
public class CustomDialog extends Dialog {
	//实现默认构造函数
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
	//所有的方法执行完都会返回一个Builder使得后面可以直接create和show
	 public static class Builder {
	        private Context context;
	        private String title;
	        private String message;
	        private String positiveButtonText;//确定按钮
	        private String negativeButtonText;//取消按钮
	        private View contentView;
	        //确定按钮事件
	        private DialogInterface.OnClickListener positiveButtonClickListener;
	        //取消按钮事件
	        private DialogInterface.OnClickListener negativeButtonClickListener;
	        //listview的item点击事件

	       public Builder(Context context) {
	            this.context = context;
	        }
	        //设置消息
	        public Builder setMessage(String message) {
	            this.message = message;
	            return this;
	        }

	        /**
	         *设置内容
	         * 
	         * @param title
	         * @return
	         */
	        public Builder setMessage(int message) {
	            this.message = (String) context.getText(message);
	            return this;
	        }

	        /**
	         * 设置标题
	         * 
	         * @param title
	         * @return
	         */
	        public Builder setTitle(int title) {
	            this.title = (String) context.getText(title);
	            return this;
	        }

	        /**
	         *设置标题
	         * 
	         * @param title
	         * @return
	         */

	        public Builder setTitle(String title) {
	            this.title = title;
	            return this;
	        }
	        //设置整个背景
	        public Builder setContentView(View v) {
	            this.contentView = v;
	            return this;
	        }
	        /**
	         * 设置确定按钮和其点击事件
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
	        //设置取消按钮和其事件
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
	    //createview方法
	        public CustomDialog create() {
	            LayoutInflater inflater = (LayoutInflater) context
	                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            // 设置其风格
	            final CustomDialog dialog = new CustomDialog(context,R.style.MyDialog);
	            View layout = inflater.inflate(R.layout.exit_dialog, null);
	            dialog.addContentView(layout, new LayoutParams(
	                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	            // 设置标题
	            ((TextView) layout.findViewById(R.id.dialog_title_textview)).setText(title);


	            //设置确定按钮
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
	                 // 如果没有确定按钮就将其隐藏
	                layout.findViewById(R.id.dialog_confirm_button).setVisibility(
	                        View.GONE);
	            }
	            // 设置取消按钮
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
	                // 如果没有取消按钮就将其隐藏
	                layout.findViewById(R.id.dialog_cancel_button).setVisibility(
	                        View.GONE);
	            }
	            // 设置内容
	            if (message != null) {
	                ((TextView) layout.findViewById(R.id.dialog_content_textview)).setText(message);
	            } else if (contentView != null) {
	                // if no message set
	                // 添加view
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